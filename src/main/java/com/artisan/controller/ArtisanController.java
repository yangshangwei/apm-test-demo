package com.artisan.controller;


import java.util.List;
import java.util.concurrent.TimeUnit;

import com.artisan.service.ArtisanService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artisan.model.Artisan;
import com.artisan.result.CodeMsg;
import com.artisan.result.Result;
import com.artisan.service.ArtisanService;

@RestController
public class ArtisanController {

    @Autowired
    private ArtisanService artisanService;

    @Autowired
    private ArtisanService2 artisanService2;

    @GetMapping("/test")
    public String test() {
        return "artisan test";
    }

    // 正常情况
    @GetMapping("/artisans")
    public Result<List<Artisan>> selectAllArtisan() {
        return Result.success(artisanService.getArtisanList());
    }




    // 模拟异常情况
    @GetMapping("/artisansError")
    public Result<List<Artisan>> selectAllArtisanError() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return Result.error(CodeMsg.SERVER_ERROR);
    }


    @GetMapping("/artisanbyName")
    public Result<List<Artisan>> selectArtisnByName() throws InterruptedException {
        return Result.success(artisanService.selectArtisanByName("周杰伦"));
    }


    // 正常情况
    @GetMapping("/artisans2")
    public Result<List<Artisan>> selectAllArtisan2() {
        return Result.success(artisanService2.getArtisanList2());
    }

    @GetMapping("/artisanbyName2")
    public Result<List<Artisan>> selectArtisnByName2() throws InterruptedException {
        return Result.success(artisanService2.selectArtisanByName2("小笼包"));
    }


    @GetMapping("/artisanbyNameAndSex")
    public Result<List<Artisan>> selectArtisnByNameAndSex()  {
        return Result.success(artisanService2.selectArtisanByNameAndSex("小笼包","女"));
    }
}
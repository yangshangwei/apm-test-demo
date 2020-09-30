package com.artisan.service.impl2;

/**
 * @author 小工匠
 * @version 1.0
 * @description: TODO
 * @date 2020/9/29 21:36
 * @mark: show me the code , change the world
 */

import com.artisan.mapper.ArtisanMapper;
import com.artisan.model.Artisan;
import com.artisan.service.ArtisanService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtisanServiceImpl2 implements ArtisanService2 {

    @Autowired
    private ArtisanMapper artisanMapper;

    @Override
    public List<Artisan> getArtisanList2() {
        return artisanMapper.selectArtisan();
    }

    @Override
    public List<Artisan> selectArtisanByName2(String name) {
        return artisanMapper.selectArtisanByName(name);
    }

}
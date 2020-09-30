package com.artisan.service;

/**
 * @author 小工匠
 * @version 1.0
 * @description: TODO
 * @date 2020/9/29 21:35
 * @mark: show me the code , change the world
 */

import com.artisan.model.Artisan;

import java.util.List;

public interface ArtisanService2 {

    List<Artisan> getArtisanList2();

    List<Artisan> selectArtisanByName2(String name);
}
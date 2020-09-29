package com.artisan.service.impl;

/**
 * @author 小工匠
 * @version 1.0
 * @description: TODO
 * @date 2020/9/29 21:36
 * @mark: show me the code , change the world
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artisan.mapper.ArtisanMapper;
import com.artisan.model.Artisan;
import com.artisan.service.ArtisanService;

@Service
public class ArtisanServiceImpl implements ArtisanService {

    @Autowired
    private ArtisanMapper artisanMapper;

    @Override
    public List<Artisan> getArtisanList() {
        return artisanMapper.selectArtisan();
    }

}
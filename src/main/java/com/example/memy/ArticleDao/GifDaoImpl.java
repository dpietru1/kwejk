package com.example.memy.ArticleDao;

import com.example.memy.Model.Gif;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 02.08.2017.
 */
public class GifDaoImpl implements GifDao{

    private static List<Gif> gifList = new ArrayList<>();
    static {
        gifList.add(new Gif("android-explosion", true));
        gifList.add(new Gif("ben-and-mike", false));
        gifList.add(new Gif("book-dominos", false));
        gifList.add(new Gif("compiler-bot", true));
        gifList.add(new Gif("cowboy-coder", false));
        gifList.add(new Gif("infinite-andrew", false));

    }
    public List<Gif> allGifs(){
        return gifList;
    }
}

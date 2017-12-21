/**
 * Copyright (C) 2014-2017 南京墨博云舟信息科技有限公司 All Rights Reserved.
 */
package com.plugins.xlb;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @goal CustomMavenMojo
 * @phase compile
 * @requiresProject false
 */
public class CustomMavenMojo extends AbstractMojo {

    /**
     * @parameter
     */
    private String[] names;

    /**
     * @parameter expression="${path}"
     * @required
     */
    private String path;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("==============开始读取文件===========================");
        for(String item:names){
            redFiles(path+item,item);
        }
        getLog().info("==============结束读取文件信息===========================");
    }

    private void redFiles(String path,String name) {
        BufferedReader bufferedReader = null;
        try {
            System.out.println("\n");
            System.out.println("\t\t\t\t开始读写："+name+"====================\n");
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
            String temp;
                while ((temp=bufferedReader.readLine()) !=null){
                    System.out.println(temp);
                }
        } catch (FileNotFoundException e) {
            try {
                bufferedReader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

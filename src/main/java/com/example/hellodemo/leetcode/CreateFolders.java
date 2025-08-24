package com.example.hellodemo.leetcode;

import java.io.File;

public class CreateFolders {
    public static void main(String[] args) {
        // 根目录
        String basePath = "F:\\idea_project\\leetCodeSol\\src\\main\\java\\com\\example\\hellodemo\\leetcode";

        for (int i = 1; i <= 200; i++) {
            String folderName = "p" + i;
            File dir = new File(basePath, folderName);

            if (!dir.exists()) {
                boolean created = dir.mkdirs();
                if (created) {
                    System.out.println("创建成功: " + dir.getAbsolutePath());
                } else {
                    System.out.println("创建失败: " + dir.getAbsolutePath());
                }
            }
        }
    }
}

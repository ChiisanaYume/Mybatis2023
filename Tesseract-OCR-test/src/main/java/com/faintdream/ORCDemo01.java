package com.faintdream;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.util.Objects;

public class ORCDemo01 {
    public static void main(String[] args) {

        File testDataPath = new File(Objects.requireNonNull(Thread.currentThread().getContextClassLoader().
                getResource("image_16.png")).toString());
        //System.out.println(testDataPath);

        String result = ocrTest(testDataPath);

        System.out.println(result);
    }

    /**
     * 测试文字识别
     *
     * @param path 要识别的图片路径
     * @return 识别的文字内容
     */
    public static String ocrTest(File path) {

        // 创建 Tesseract实例
        ITesseract tesseract = new Tesseract();

        // 读取文件并进行识别
        try {
            return tesseract.doOCR(path);
        } catch (TesseractException e) {
            // 捕获异常
            throw new RuntimeException(e);
        }

    }
}

/*
 * SLF4J: No SLF4J providers were found.
 * SLF4J: Defaulting to no-operation (NOP) logger implementation
 * 需要添加一个日志框架作为依赖
 * */

package com.faintdream.pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * 打开一个PDF文件并执行操作
 *
 * */
public class PDFBoxDemo02 {
    public static void main(String[] args){

        // 类路径
        String classPath = Objects.requireNonNull(PDFBoxDemo02.class.getResource("/")).getPath();

        // 指定要打开的PDF文件(file)
        File pdfFile = new File(classPath + "1.pdf");

        // PDDocument对象(用于加载PDF文件)
        PDDocument document = null;
        try{

            // 加载PDF文件
            document = PDDocument.load(pdfFile);

            // 操作PDF对象
            // test1(document);
            test2(document,2);


        }
        catch(IOException e){
            e.printStackTrace();
        } finally {
            if(document!=null){
                try {
                    document.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 读取所有文本测试
     * @param document PDDocument对象
     * */
    public static void test1(PDDocument document) throws IOException {


        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        System.out.println(text);
    }

    /**
     * 读取文本的某一页
     * @param document PDDocument对象
     * @param page 页码
     * */
    public static void test2(PDDocument document,int page) throws IOException {

        PDFTextStripper pdfStripper = new PDFTextStripper();

        pdfStripper.setStartPage(page); // start at page 1
        pdfStripper.setEndPage(page); // end at page 1

        String text = pdfStripper.getText(document);
        System.out.println(text);
    }

}

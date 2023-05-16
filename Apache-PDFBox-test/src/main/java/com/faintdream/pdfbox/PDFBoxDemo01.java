package com.faintdream.pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

/**
 * PDF操作测试(PDFBox)
 * @author faintdream
 * @version 1.0
 * */
public class PDFBoxDemo01 {

    public static void main(String[] args) {

        // 创建一个新的pdf文档
        PDDocument document = new PDDocument();

        // 创建一个新页面
        PDPage page = new PDPage(PDRectangle.A4);
        document.addPage(page);

        // 在页面上添加文字
        try {
            PDPageContentStream contentStream = new PDPageContentStream(document,page);
            contentStream.setFont(PDType1Font.HELVETICA_BOLD,12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100,700);
            contentStream.showText("Hello,PDFBox!");
            contentStream.endText();
            contentStream.close();

            // 保存pdf文档
            document.save("Hello.pdf");
            document.close();
            System.out.println("PDF created successfully!!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import java.io.Reader;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        try {
            switch (imageTypes) {
                case BMP:
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                case PNG:
                    return new PngReader();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return null;
    }
}

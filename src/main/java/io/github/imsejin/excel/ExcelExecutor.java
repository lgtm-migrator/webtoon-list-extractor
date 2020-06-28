package io.github.imsejin.excel;

import io.github.imsejin.file.model.Webtoon;

import java.io.File;
import java.util.List;

/**
 * ExcelExecutor
 *
 * @author SEJIN
 */
public final class ExcelExecutor {

    private ExcelExecutor() {}

    public static void createWebtoonList(List<Webtoon> webtoons, String pathName) {
        ExcelService.forCreating(webtoons)
                .create()
                .decorate()
                .save(pathName);
    }

    public static void updateWebtoonList(List<Webtoon> webtoons, String pathName, File file) {
        ExcelService.forUpdating(webtoons, file)
                .read()
                .update()
                .decorate()
                .save(pathName);
    }

}

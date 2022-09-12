package io.github.imsejin.wnliext.excel.config;

import com.github.javaxcel.styler.ExcelStyleConfig;
import com.github.javaxcel.styler.config.Configurer;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;

public class BodyStyleConfig implements ExcelStyleConfig {

    @Override
    public void configure(Configurer configurer) {
        configurer.alignment()
                .vertical(VerticalAlignment.CENTER)
                .and()
                .border()
                .all(BorderStyle.THIN, IndexedColors.BLACK)
                .and()
                .font()
                .name("NanumGothic")
                .size(10)
                .color(IndexedColors.BLACK);
    }

}

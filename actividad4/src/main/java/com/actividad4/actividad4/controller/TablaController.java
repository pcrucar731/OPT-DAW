package com.actividad4.actividad4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablaController {

    @GetMapping("/tabla")
    public String tabla(
            @RequestParam(defaultValue = "1") String filas,
            @RequestParam(defaultValue = "1") String columnas) {

        int f;
        int c;

        try {
            f = Integer.parseInt(filas);
        } catch (NumberFormatException e) {
            f = 1;
        }

        try {
            c = Integer.parseInt(columnas);
        } catch (NumberFormatException e) {
            c = 1;
        }

        if (f < 1) f = 1;
        if (f > 20) f = 20;

        if (c < 1) c = 1;
        if (c > 20) c = 20;

        String html = "<html><body><table border='1'>";

        html += "<tr><th></th>";

        for (int j = 1; j <= c; j++) {
            html += "<th>Columna " + j + "</th>";
        }

        html += "</tr>";

        for (int i = 1; i <= f; i++) {
            html += "<tr><th>Fila " + i + "</th>";

            for (int j = 1; j <= c; j++) {
                html += "<td>Fila " + i + ", Columna " + j + "</td>";
            }

            html += "</tr>";
        }

        html += "</table></body></html>";

        return html;
    }
}
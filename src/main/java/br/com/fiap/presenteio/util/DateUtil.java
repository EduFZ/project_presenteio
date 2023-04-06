package br.com.fiap.presenteio.util;

import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;

@Repository
public class DateUtil {
    public String formatDate(String data){
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        return formatData.format(data);
    }
}

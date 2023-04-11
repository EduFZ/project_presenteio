package br.com.fiap.linkverse.util;

import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

@Repository
public class DateUtil {
    public String formatDate(Date data){
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        return formatData.format(data);
    }

}

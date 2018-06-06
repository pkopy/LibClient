package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class Main  {



    public static void main(String[] args) {
//        System.out.println(Utils.makeRequest("http://localhost:8080/rest"));
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
//        BookEntity bookEntity = restTemplate.getForObject("http://localhost:8080/rest/7", BookEntity.class);
//        System.out.println(bookEntity.getTitle());
        //////////////////////////
        BookEntity bookEntity1 = new BookEntity();
        bookEntity1.setAuthor("Paweł k");
        bookEntity1.setPages(120);
        bookEntity1.setTitle("Z aplikacji");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);



//        restTemplate.postForObject("http://localhost:8080/rest", entity, String.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj klucz");
        String key = scanner.nextLine();
        httpHeaders.add("key",key);
//        HttpEntity entity = new HttpEntity(httpHeaders);

        System.out.println("Podaj tytuł");
        String title = scanner.nextLine();


        Boolean isTitleExist = restTemplate.getForObject("http://localhost:8080/rest/" + title, Boolean.class);
        System.out.println(isTitleExist);
//        BookEntity bookEntity = restTemplate.getForObject("http://localhost:8080/rest/" + id, BookEntity.class);
//        System.out.println(bookEntity.getTitle());
//        System.out.println(bookEntity.getAuthor());
//        System.out.println(bookEntity.getPages());

//        restTemplate.exchange("http://localhost:8080/rest/" + id, HttpMethod.DELETE, entity, String.class);

//        System.out.println("http://localhost:8080/rest/"+key);
//        System.out.println(id);

//        BookEntity bookEntity = new BookEntity();
////        System.out.print("Podaj id");
////        bookEntity.setId(id);
//        System.out.print("Podaj nowy tytuł");
//        bookEntity.setTitle(scanner.nextLine());
//        System.out.print("Podaj nowego autora");
//        bookEntity.setAuthor(scanner.nextLine());
//        System.out.print("Podaj nową ilość stron");
//        bookEntity.setPages(Integer.parseInt(scanner.nextLine()));

//
//        HttpEntity<BookEntity> entity = new HttpEntity<BookEntity>(bookEntity,httpHeaders);
//
//        if(bookEntity.getAuthor().equals("")){
//            System.out.println("złe dane");
//            return ;
//        }else{
//            restTemplate.exchange("http://localhost:8080/rest/" , HttpMethod.PUT, entity, String.class);
//
//        }




    }
}

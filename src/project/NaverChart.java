package project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class NaverChart {
        public static void main(String[] args) {
            try {
                Document doc = Jsoup.connect("https://www.naver.com/").get();
                System.out.println(doc.html());
                Elements elements = doc.getElementsByClass("area_navigation").select("li");
                List<String> keywords = elements.eachText();

                System.out.println("<< 네이버 실시간 검색어 >>");
                for(int i=0; i<keywords.size(); i++) {
                    System.out.println((i+1) + ". " + keywords.get(i));
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
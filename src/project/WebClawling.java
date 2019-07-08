package project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebClawling {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://sports.news.naver.com/wbaseball/record/index.nhn").get();
            Elements elements = doc.getElementsByClass("name");
            List<String> keywords = elements.eachText();

            System.out.println("<< 메이저리그 팀 순위 >>");
            for(int i=0; i<keywords.size(); i++) {
                System.out.println((i+1) + ". " + keywords.get(i));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

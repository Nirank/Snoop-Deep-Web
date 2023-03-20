package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        org.example.CrawlerTopology crawlerTopology = new org.example.CrawlerTopology();
        crawlerTopology.crawlerTopologyInitializer();
        Scanner sc = new Scanner(System.in);
        int id =sc.nextInt();
        org.example.CrawlerDatabaseManagement.dataRetrieval(id);
    }
}

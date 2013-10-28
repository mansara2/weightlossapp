import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;


public class BarDB{
	 String barID;
	 double rating;
	 boolean sports,club,casual,lounge,pub,karaoke;
	 public void check(String bid){
		 if(bid.equals("Brothers")){
			 sports=true;
			 club=true;
			 casual=false;
			 lounge=false;
			 pub=false;
			 karaoke=false;
		 }
		 if(bid.equals("Red Lion")){
			 sports=false;
			 club=true;
			 casual=false;
			 lounge=false;
			 pub=false;
			 karaoke=false;
		 }
		 if(bid.equals("The Clybourne")){
			 sports=false;
			 club=true;
			 casual=false;
			 lounge=false;
			 pub=false;
			 karaoke=false;
		 }
		 if(bid.equals("Firehaus")){
			 sports=true;
			 club=false;
			 casual=true;
			 lounge=false;
			 pub=false;
			 karaoke=false;
		 }
		 if(bid.equals("Murphy's")){
			 sports=true;
			 club=false;
			 casual=true;
			 lounge=false;
			 pub=true;
			 karaoke=false;
		 }
	 }
}



package languages;

class Language{
protected String name;
protected int numSpeakers;
protected String regionsSpoken;
protected String wordOrder;
 Language(String name,int speakers,String regionSpoken,String wordOrder)
 {
   this.name=name;
   this.numSpeakers= speakers;
   this.regionsSpoken = regionSpoken;
   this.wordOrder = wordOrder;
}
public void getInfo()
{
  System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+" . "+
"The language follows the word order: "+this.wordOrder+".");
}
  public static void main(String[] args)
  {

  Language english = new Language("English",500000,"USA","subject-verb-object");
  english.getInfo();
  Mayan kiche = new Mayan("kiche",5000);
  kiche.getInfo();
  SinoTibetan mandarinc = new SinoTibetan("Mandarin Chinese",20000);
  mandarinc.getInfo();
   SinoTibetan mandarin = new SinoTibetan("Mandarin",30000);
  mandarin.getInfo();

  }
}
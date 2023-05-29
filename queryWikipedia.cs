using Newtonsoft.Json.Linq;
using System.Net;

string topic = "pizza";
string URL = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=" + topic;
int count = 0;
using (WebClient wc = new System.Net.WebClient())
{
    var json = wc.DownloadString(URL);
    // we have a JSON object that we have to access now
    var jo = JObject.Parse(json);
    var title = jo["parse"]["title"].ToString();
    var text = jo["parse"]["text"].ToString();
    //Console.WriteLine(title);
    //Console.WriteLine(topic);
    //Console.WriteLine(text);
    // Count the number of times "topic" appears in "text" of the article:
    count = text.Split(new string[] { topic }, StringSplitOptions.None).Length - 1;
    Console.WriteLine(count);
}

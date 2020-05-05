import java.util.ArrayList;
import java.util.List;

public class Video {

        protected String url;
        protected String title;
        protected ArrayList<String> tags = new ArrayList<String>();

        public Video(String url, String title, ArrayList<String> tags) {
            this.url = url;
            this.title = title;
            this.tags = tags;
        }

        public String getUrl() {
            return url;
        }

        public String getTitle() {
            return title;
        }

        public ArrayList<String> getTags() {
            return tags;
        }

        //public void addTags(ArrayList<String> etiquetas) throws Exception {
        //if (etiquetas.size() < 1)
        //    throw new Exception();
        //String etiqueta = onetag;
        //this.tags.add(etiqueta);
        //}

}

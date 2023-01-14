import java.util.List;

public class DesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int width=word.length();
        int height=0;
        for(int i=0;i<width;i++){
            int currHeight=h.get(word.charAt(i)-'a');
            height=Math.max(height, currHeight);
        }
        return width*height;
    }
}

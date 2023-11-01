import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class toDo implements Able {
   public  String subStr(String str){
        StringBuilder current = new StringBuilder();
        for (int i = str.length()-1; i > -1 ; i--) {
            if(str.charAt(i)=='/')
                break;
            current.append(str.charAt(i));
        }
        return current.reverse().toString();
    }
    //Organize anum  mer filery hmpt Directoryneri mej
   public   void  moveFile(List<String> filePaths, List<String> directoryPaths){

        for (int i = 0;i < filePaths.size();i++){

            if (expansion(filePaths.get(i)).equals( "txt" )){
                moveFile(filePaths.get(i),rightDirect(directoryPaths,"txt"));

            }  if(expansion(filePaths.get(i)).equals("mp3")){

                moveFile(filePaths.get(i),rightDirect(directoryPaths,"mp3"));

            } if (expansion(filePaths.get(i)).equals( "mp4" )){

                moveFile(filePaths.get(i),rightDirect(directoryPaths,"mp4"));
            }
        }

        System.out.println("Organizer !!!");
    }

    // veradracnum e chisht endlaynumov fili chisht directoryin
   public   String rightDirect(List<String> dir,String expansion){
        StringBuilder current = new StringBuilder();
        if(expansion.equals("txt")){
            for (int i = 0; i < dir.size(); i++) {
                if (dir.get(i).equals("/home/lilit/IdeaProjects/directoryandFile/exampleDirectory"))
                {

                    return dir.get(i);}
            }
        } if(expansion.equals("mp3")){
            for (int i = 0; i < dir.size(); i++) {
                if (dir.get(i).equals("/home/lilit/IdeaProjects/directoryandFile/Audio"))

                {
                    return dir.get(i);}
            }
        } if(expansion.equals("mp4")){
            for (int i = 0; i < dir.size(); i++) {
                if (dir.get(i).equals("/home/lilit/IdeaProjects/directoryandFile/Video"))
                {
                    return dir.get(i);}
            }
        }


        return current.toString();
    }
    //finds an extension
  public    String expansion(String str){

        StringBuilder current = new StringBuilder();
        for (int i = str.length()-1;i > -1;i--){
            if (str.charAt(i) ==  '.')
                break;
            current.append(str.charAt(i));
        }
        return current.reverse().toString();
    }
    //performs a transfer
    public  void moveFile(String filePath, String directoryPath){
        String str = subStr(filePath);
        Path path = Paths.get(filePath);
        Path destPath = Paths.get(directoryPath + "/" + str);

        try {
            // Files.createDirectory(pathDirectory);
            //  Files.createFile(path);

            Files.move(path, destPath);
            //  System.out.println("File move successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: ++" + e.getMessage());
        }
    }

   
}

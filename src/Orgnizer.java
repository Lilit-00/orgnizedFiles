import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orgnizer {
    static void startOrganizing() throws IOException {
        String filePath = "/home/lilit/IdeaProjects/directoryandFile/example1.txt";
        String filePathAudio = "/home/lilit/IdeaProjects/directoryandFile/example1.mp3";
        String filePathVideo= "/home/lilit/IdeaProjects/directoryandFile/example1.mp4";

        Path path = Paths.get(filePath);
        Path pathAudio = Paths.get(filePathAudio);
        Path pathVideo = Paths.get(filePathVideo);



        //directory chanaparh
        String directoryPath = "/home/lilit/IdeaProjects/directoryandFile/exampleDirectory";
        String directoryPathAudio= "/home/lilit/IdeaProjects/directoryandFile/Audio";
        String directoryPathVideo= "/home/lilit/IdeaProjects/directoryandFile/Video";



        Path pathDirectory = Paths.get(directoryPath);
        Path  pathDirectoryAudio = Paths.get(directoryPathAudio);
        Path  pathDirectoryVideo = Paths.get(directoryPathVideo);

        File file = new File(directoryPath);
        File fileAudio = new File(directoryPathAudio);
        File fileVideo = new File(directoryPathVideo);





        //created directory
        if (file.mkdir() && fileAudio.mkdir() && fileVideo.mkdir()) {
            System.out.println("created!");
        } else {
            System.out.println("not created");
        }

        List<String> filePaths = new ArrayList<>();
        filePaths.add(filePath);
        filePaths.add(filePathAudio);
        filePaths.add(filePathVideo);

        List<String> directoryPaths = new ArrayList<>();
        directoryPaths.add(directoryPath);
        directoryPaths.add(directoryPathAudio);
        directoryPaths.add(directoryPathVideo);


        //created file
        Files.createFile(path);
        Files.createFile(pathAudio);
        Files.createFile(pathVideo);

        System.out.println("--------if  you want to organized  ,then write 'move Files'--------");


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.equals("move Files")){
            new toDo().moveFile(filePaths,directoryPaths); //Listi hamar e kanchum

            //moveFile(filePath,directoryPath);
        }else {
            System.out.println("Completed the job without result !!!");
        }
    }

}

import java.util.List;

public interface Able {
    void moveFile(String filePath, String directoryPath);
    String expansion(String str);
    String rightDirect(List<String> dir, String expansion);
    String subStr(String str);
}

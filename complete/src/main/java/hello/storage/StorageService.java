package hello.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.Date;
import java.util.Map;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    void store(MultipartFile file, long date);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

	Map<String, String> getLastHourFilesData();

}

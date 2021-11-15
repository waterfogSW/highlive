package waterfogsw.highlive.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExecCrawler implements ExecPython {
    private static final String crawlerPath = "./python/crawler.py";

    @Override
    public void execPython(String videoId) {
        List<String> command = new ArrayList<>();

        command.add("python3");
        command.add(crawlerPath);
        command.add(videoId);

        ProcessRunner.run(command);
    }
}

package ro.andrei.fileit.util;

import java.io.*;
import java.util.Iterator;

public class FileUtil implements AutoCloseable, Iterable<String>{
    private final String fileName;
    private final BufferedReader in;

    public FileUtil(String fileName) throws IOException{
        this.fileName = fileName;
        this.in = new BufferedReader(new FileReader(fileName));
    }

    @Override
    public void close() throws IOException {
        this.in.close();
    }


    @Override
    public Iterator<String> iterator() {
        return new FileIterator(in);
    }

    private class FileIterator implements Iterator<String>{

        private BufferedReader file;
        private String nextLine;

        public FileIterator(BufferedReader file){
            this.file = file;
        }

        @Override
        public boolean hasNext() {
            try {
                if (( nextLine = file.readLine())!=null) {
                    return true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            nextLine = null;
            return false;
        }

        @Override
        public String next() {
            return nextLine;
        }
    }
}

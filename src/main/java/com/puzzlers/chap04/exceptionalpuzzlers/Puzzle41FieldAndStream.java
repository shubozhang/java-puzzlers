package com.puzzlers.chap04.exceptionalpuzzlers;

import java.io.*;

/**
 * when you call the close method in a finally block, protect it
 * with a nested try-catch to prevent propagation of the IOException. More generally,
 * handle any checked exception that can be thrown within a finally block
 * rather than letting it propagate.
 */
public class Puzzle41FieldAndStream {

    static void copy(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        } finally {
            /*
            * The close method can throw an
            * IOException too. If this happens when in.close is called, the exception prevents
            * out.close from getting called, and the output stream remains open.
            * */
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

    static void copy1(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                // There is nothing we can do if close fails
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                 // Again, there is nothing we can do if close fails
                }
            }
        }
    }

    static void copy2(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        } finally {
            closeIgnoringException(in);
            closeIgnoringException(out);
        }
    }

    private static void closeIgnoringException(Closeable c) {
        if (c != null) {
            try {
                c.close();
            } catch (IOException ex) {
         // There is nothing we can do if close fails
            }
        }
    }
}

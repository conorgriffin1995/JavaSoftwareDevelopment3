package example1;

import java.io.*;

public class BankData {

    private RandomAccessFile file;

    public static final int INT_SIZE = 4;
    public static final int DOUBLE_SIZE = 8;
    public static final int RECORD_SIZE = INT_SIZE + DOUBLE_SIZE;

    public BankData() {
        file = null;
    }

    public void open(String filename) {
        try {
            file = new RandomAccessFile(filename, "rw");
        } catch (FileNotFoundException f) {
            System.out.println("File not found");
        }
    }

    public int size()
            throws IOException {
        int s = (int) (file.length() / RECORD_SIZE);
        return s;
    }

    public void close() {
        try {
            file.close();
        } catch (IOException io) {
            System.out.println("IO Exception");
        }
    }

    public int find(int accountNumber)
            throws IOException {
        for (int i = 0; i < size(); i++) {
            file.seek(i * RECORD_SIZE);
            int a = file.readInt();
            if (a == accountNumber) {
                return i;
            }
            // Found a match            
        }
        return -1; // No match in the entire file
    }
    
    public BankAccount read(int n)
            throws IOException {
        file.seek(n * RECORD_SIZE);
        int accountNumber = file.readInt();
        double balance = file.readDouble();
        return new BankAccount(accountNumber, balance);
    }
    
    public void write(int n, BankAccount account)
            throws IOException {
        file.seek(n * RECORD_SIZE);
        file.writeInt(account.getAccountNumber());
        file.writeDouble(account.getBalance());
    }
}



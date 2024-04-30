package hm5;

import java.io.FileOutputStream;
import java.io.IOException;

public class FieldWriter {
    public static void writeField(int[] field, String filePath) {
        byte[] data = new byte[3];

        int packedData = 0;
        for (int i = 0; i < field.length; i++) {
            packedData |= (field[i] & 0x03) << (i * 2);
        }

        data[0] = (byte) ((packedData >> 16) & 0xFF);
        data[1] = (byte) ((packedData >> 8) & 0xFF);
        data[2] = (byte) (packedData & 0xFF);

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(data);
            System.out.println("Field data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] field = {1, 0, 2, 3, 1, 2, 0, 3, 2};
        writeField(field, "./field_data.bin");
    }
}

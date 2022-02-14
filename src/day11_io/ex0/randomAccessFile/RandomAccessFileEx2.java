package day11_io.ex0.randomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
	public static void main(String[] args) throws IOException {
		// 읽어들일 사이즈
		int seekSize = 5;

		// 읽기전용으로 파일을 읽음
		RandomAccessFile rdma = new RandomAccessFile("example.txt", "r");
		String line = "";

		// 전체 문자열 길이
		while ((line = rdma.readLine()) != null) {
			System.out.println(line);
		}

		// 문자열총길이
		System.out.println("total length : " + rdma.length() + "\n");

		byte[] data = null;

		// 루프사이즈 = 총길이 / seeksize + (총길이%seeksize의 나머지가 0이면 0반환 0이 아니면 1을 반환)
		long size = rdma.length() / seekSize + (rdma.length() % seekSize == 0 ? 0 : 1);
		
		for (int i = 0; i < size; i++) {
			data = new byte[seekSize];

			// seekSize 만큼 증가
			rdma.seek(i * seekSize);
			rdma.read(data);

			// 바이트 데이터를 문자열로 변환(trim()을 사용해 공백 제거)
			System.out.printf("pointer : %02d  str : %s \n", rdma.getFilePointer(), new String(data).trim());
		}

		// 파일 닫기
		rdma.close();
	}
}

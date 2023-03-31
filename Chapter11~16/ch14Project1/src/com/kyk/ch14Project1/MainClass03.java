package com.kyk.ch14Project1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {

	public static void main(String[] args) {
		//�÷���(List, Set)���κ��� ��Ʈ�� �����ϱ�
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//Consumer�� �߻�޼��� void accept(T t)
		Consumer<Integer> con = (n) -> {
			System.out.println(n);
		};
		
		list.forEach(con);
		System.out.println("==========");
		
		//Collection�������̽��� ������ Ŭ������ stream()�޼��带 ���
		Stream<Integer> intStream = list.stream();
		intStream.sorted().forEach(System.out::println);
		//sorted()�� �߰�ó���������� ���ĵ� stream�� ��� forEach�� ������������ ������ ���ҿ� ���� ���� �ݺ�ó���� �Ͽ� ���ٽ����� ó���Ѵ�.(�޼��� ������� ���ٽ�)
		
		//�迭�κ��� ��Ʈ������
		Stream<String> strStream1 = Stream.of("a","b","c"); //��������
		//static <T> Stream<T> of (T t) : ���׸��޼���� static������ ���ǵ� �������̽��� �޼���
		Stream<String> strStream2 = Stream.of(new String[]{"a","b","c"}); //�迭��ü�� �Ķ���ͷ� ���
		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c"}); //Arrays.stream()�޼��� ���
		Stream<String> strStream4 = Arrays.stream(new String[] {"a","b","c"}, 0, 3);
		//0�� ���ۻ��ι�ȣ 3�� end���ι�ȣ, ������ 0 ~ 3-1
		strStream4.sorted().forEach(System.out::println);
		
		//Ư�� ������ ������ ��ҷ� ���� ��Ʈ�� �����ϱ�(���� stream�� Stream<Integer>���� IntStream�� ���)
		IntStream intStream1 = IntStream.range(1, 5); //1���� 5-1���� ��
		intStream1.sorted().forEach(System.out::println);
		IntStream intStream2 = IntStream.rangeClosed(1, 5); //1���� 5����
		intStream2.sorted().forEach(System.out::println);
		
		//������ ��ҷ� ���� ��Ʈ�� �����ϱ�
		IntStream rintStream = new Random().ints(); //������ ������ �� IntStream�ν��Ͻ��� ��ȯ�ϴ� �޼��� ints()
		rintStream.limit(5).forEach(System.out::println); //5���� ��Ҹ� ����Ѵ�.
		IntStream rintStream2 = new Random().ints(5); //���� �� 5���� ����
		
		//���ٽ��� �ҽ��� �ϴ� ��Ʈ�� �����ϱ�
		Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
		//0�� seed��, n->n+2�� �ʱⰪ�� �޾Ƽ� 2�� ���� ���� �߰��ϸ� ������ ���� seed���Ͽ� ���ѹݺ�
		Stream<Double> randomStream = Stream.generate(Math::random); //generate()�� ��ȣ ���� ���ٽ����� ���� Stream����
		
		//Stream<Path> Files.list(Path dir) FilesŬ������ list(Path dir)�ε� Stream��ü�� ����.
		
		//�߰����� �� ��������
		String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
		Stream<String> stream = Stream.of(strArr);
		stream.distinct().limit(5).sorted().forEach(System.out::print);
		//distinct()�� �ߺ� ����, limit(no)�� no��ŭ ����, sorted()�� �������� ����, forEach(���ٽ�)�� ���ιݺ� ���ٽ� ����
	}
}

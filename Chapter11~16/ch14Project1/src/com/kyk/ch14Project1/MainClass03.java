package com.kyk.ch14Project1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {

	public static void main(String[] args) {
		//컬렉션(List, Set)으로부터 스트림 생성하기
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//Consumer의 추상메서드 void accept(T t)
		Consumer<Integer> con = (n) -> {
			System.out.println(n);
		};
		
		list.forEach(con);
		System.out.println("==========");
		
		//Collection인터페이스를 구현한 클래스는 stream()메서드를 사용
		Stream<Integer> intStream = list.stream();
		intStream.sorted().forEach(System.out::println);
		//sorted()는 중간처리연산으로 정렬된 stream을 얻고 forEach는 최종연산으로 각각의 원소에 대해 내부 반복처리를 하여 람다식으로 처리한다.(메서드 참조방식 람다식)
		
		//배열로부터 스트림생성
		Stream<String> strStream1 = Stream.of("a","b","c"); //가변인자
		//static <T> Stream<T> of (T t) : 제네릭메서드로 static형으로 정의된 인터페이스의 메서드
		Stream<String> strStream2 = Stream.of(new String[]{"a","b","c"}); //배열객체를 파라메터로 사용
		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c"}); //Arrays.stream()메서드 사용
		Stream<String> strStream4 = Arrays.stream(new String[] {"a","b","c"}, 0, 3);
		//0은 시작색인번호 3은 end색인번호, 범위는 0 ~ 3-1
		strStream4.sorted().forEach(System.out::println);
		
		//특정 범위의 정수를 요소로 갖는 스트림 생성하기(정수 stream은 Stream<Integer>보다 IntStream을 사용)
		IntStream intStream1 = IntStream.range(1, 5); //1부터 5-1까지 값
		intStream1.sorted().forEach(System.out::println);
		IntStream intStream2 = IntStream.rangeClosed(1, 5); //1부터 5까지
		intStream2.sorted().forEach(System.out::println);
		
		//난수를 요소로 갖는 스트림 생성하기
		IntStream rintStream = new Random().ints(); //임의의 정수로 된 IntStream인스턴스를 반환하는 메서드 ints()
		rintStream.limit(5).forEach(System.out::println); //5개의 요소만 출력한다.
		IntStream rintStream2 = new Random().ints(5); //생성 시 5개만 생성
		
		//람다식을 소스로 하는 스트림 생성하기
		Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
		//0을 seed값, n->n+2는 초기값을 받아서 2를 더한 값을 추가하며 마지막 값을 seed로하여 무한반복
		Stream<Double> randomStream = Stream.generate(Math::random); //generate()도 괄호 안의 람다식으로 무한 Stream생성
		
		//Stream<Path> Files.list(Path dir) Files클래스의 list(Path dir)로도 Stream객체를 얻어낸다.
		
		//중간연산 및 최종연산
		String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
		Stream<String> stream = Stream.of(strArr);
		stream.distinct().limit(5).sorted().forEach(System.out::print);
		//distinct()는 중복 제거, limit(no)는 no만큼 선택, sorted()는 오름차순 정렬, forEach(람다식)은 내부반복 람다식 실행
	}
}

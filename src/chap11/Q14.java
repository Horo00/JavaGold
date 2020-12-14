package chap11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap11.Musician.Category;

public class Q14 {

	public static void main(String[] args) {

		List<Musician> musicList = Arrays.asList(
				new Musician("Jimi Hendrix", Category.ROCK),
				new Musician("Eric Dolphy", Category.JAZZ),
				new Musician("J.S.Bach", Category.CLASSICAL),
				new Musician("Charles", Category.JAZZ));

		Map<Category, List<String>> map = musicList.stream()
				.collect(Collectors.groupingBy(
						Musician::getCategory,
						Collectors.mapping(Musician::getName, Collectors.toList())));

		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(e -> System.out.print(e + ""));
	}

}

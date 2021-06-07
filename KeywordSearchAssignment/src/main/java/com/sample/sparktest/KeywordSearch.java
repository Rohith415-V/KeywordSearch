package com.sample.sparktest;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class KeywordSearch {

	public boolean findKeyword(String filePath, String keyword) {

		if (filePath == null) {
			System.err.println("Please provide the input file full path Search Keyword");
			System.exit(0);
		}

		if (keyword == null) {
			System.err.println("Please provide the Search Keyword");
			System.exit(0);
		}

		SparkService sparkService = new SparkService();

		JavaSparkContext jsc = new JavaSparkContext(sparkService.getSparkSession().sparkContext());

		JavaRDD<String> lines = jsc.textFile(filePath);

		for (String line : lines.collect()) {
			if (line.contains(keyword)) {
				System.out.println("Keyword " + keyword + " exists in the given file");
				return true;
			}
		}

		System.out.println("Keyword " + keyword + " doesn't exists in the given file");
		return false;
	}

}

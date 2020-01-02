package assignment;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple5;
import org.apache.flink.core.fs.FileSystem.WriteMode;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class CabAnalysis {

	public static void main(String[] args) throws Exception {
		
		// set up the streaming execution environment
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		
		DataStream<String> data = env.readTextFile("/mnt/flink/flinkworkspace/Assignment_1/cab-flink.txt");
		
		DataStream<Tuple5<String, String, String, Integer, Integer>> mapped = data.map(new Splitter());
	}
	
	public static class Splitter implements MapFunction<String, Tuple5<String, String, String, Integer, Integer>> 
	{
		public Tuple5<String, String, String, Integer, Integer> map(String value)         
		{
			String[] words = value.split(",");
			return new Tuple5<String, String, String, Integer, Integer>(words[1], words[2],	words[3], Integer.parseInt(words[4]), 1); 
		}                                                             
	}
}

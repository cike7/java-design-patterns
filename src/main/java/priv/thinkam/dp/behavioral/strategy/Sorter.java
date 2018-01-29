package priv.thinkam.dp.behavioral.strategy;

/**
 * Created by thinkam on 1/29/18.
 */
public class Sorter {
	private BaseSortStrategy sortStrategy;

	public Sorter(BaseSortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void setSortStrategy(BaseSortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void sort(int[] array) {
		sortStrategy.sort(array);
	}

}

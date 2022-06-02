package OtherJavaPrograms;

public class Snippet {
	void segregatearray(int arr[], int size)
	{
	int left = 0, right = size - 1;
	while (left < right)
	{
	while (arr[left] == 0 && left < right)
	left++;
	while (arr[right] == 1 && left < right)
	right--;
	if (left < right)
	{
	arr[left] = 0;
	arr[right] = 1;
	left++;
	right--;
	}
	}
	}
}


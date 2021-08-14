
public class baitap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// tạo 1 biến tạm
		// nó bị lỗi, phải khởi tạo cho nó một giá trị mặc định
		int max = 1;
		
		// cho chạy từ 1 -> 10
		for (int i=1; i<=10; i++)
		{
			// mới vô thì gán max cho i
			// đầu tiên cho i là giá trị lớn nhất luôn
			max = i;
			
			// nếu giá trị hiện tại là lớn nhất rồi mà giá trị kế tiếp (i+1) lớn hơn nó tức là giá trị i+1 là max
			if(max < i+1)
			{
				max = i+1; // cập nhật lại giá trị lớn nhất của thằng max
			}
			
			// trường hợp i nó chạy tới giá trị thứ 10 -> i+1 nó sẽ bằng 11 (phạm vi từ 1 -> 10 thôi)
			// thêm điều kiện chỗ này
			// i =9 là i+1 =10, lúc này là so sánh xong hết nên thoát đc r
			if (i == 9)
			{
				// thoát khỏi vòng lặp
				break;
			}
		}
		
		// thoát vòng lặp và xem kết quả
		System.out.println(max);
	}

}

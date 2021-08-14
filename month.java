
public class baitap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Khai báo kiểu mảng lưu các phần tử kiểu int
		 * Khai báo mảng thì thêm []. VD: int[]
		 * month là biến lưu tất cả các phần tử tháng theo số 1 -> 12
		 */
		int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		// phần tử đầu tiên của mảng là 0, nên bắt buộc chạy từ 0 ko phải 1;
		// month.length -> lấy số phần tử trong mảng month
		// vì chạy từ 0 nên phần tử cuối cùng là month.length - 1, ko lấy month.length.
		for (int i = 0; i< month.length; i++)
		{
			// in thử xem
			// CÁCH 1
			
			/**if (month[i] == 1) // i đang là 0, phần tử month[0] là 1 
			{
				System.out.println("thang mot");
			}
			// else mà có điều kiện phải là else if
			else if(month[i] == 2)
			{
				System.out.println("thang hai");
			}
			else if(month[i] == 3)
			{
				System.out.println("thang ba");
			}
			**/
			//... tương tự các tháng còn lại
			
			// CÁCH 2:
			/** SWITCH CASE cũng giống với if else nhưng xài cho nhiều điều kiện if, viết gọn hơn, tương tự trong trường hợp này
			 * 
			 */
			
			switch(month[i])
			{
				case 1:
					System.out.println("thang mot");
					
					// nếu thỏa điều kiện xử lí xong phải break (thoát ra)
					break;
				case 2:
					System.out.println("thang hai");
					break;
				case 3:
					System.out.println("thang ba");
					break;
				//... tương tự các tháng còn lại
				// chỗ này để xủ lý trường hợp giá trị không nằm trong mảng month. VD: 16
				default:
					System.out.println("khong hop le");
					break;
				// mấy chỗ không hợp lệ là tại chỉ mới làm tới tháng 3 thôi :)))
			}
		}
		
		

	}

}

package scripts;

/**
 * 3���� �ǽ� �ڵ�
 * 
 * kkma ���¼� �м��⸦ �̿��Ͽ� index.xml ������ �����ϼ���.
 * 
 * index.xml ���� ������ �Ʒ��� �����ϴ�.
 * (Ű����1):(Ű����1�� ���� �󵵼�)#(Ű����2):(Ű����2�� ���� �󵵼�)#(Ű����3):(Ű����3�� ���� �󵵼�) ... 
 * e.g., ���:13#�а���:4#�ް�:1 ...
 * 
 * input : collection.xml
 * output : index.xml 
 */

public class makeKeyword {

	private String input_file;
	private String output_flie = "./index.xml";
	
	public makeKeyword(String file) {
		this.input_file = file;
	}

	public void convertXml() {

	}

}

package main;

import java.io.File;

interface InterBoard {
	
	// �߻� �޼��带 ������ �־�, ������ Override ��Ű���ؼ� 
	// ��� ���� ���̿��� �޼ҵ带 ������ ���� �ϱ����ؼ�
	abstract void upload(String url, File file);	
	abstract void requestUp(); 
	abstract void requestDelete();
	void print();			// abstract �� ���ٰ� �ϴ���, interface�� ������ abstract�� �����ش�
	
}

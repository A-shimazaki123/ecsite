package jp.co.internous.ecsite.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //個々のレコードに対して処理を加えるクラスと指定
@Table(name="user") //entityにuserテーブルをマッピング
public class User{

	
//userテーブルの各カラムをフィールドとして宣言
	@Id //主キーフィールドであると宣言
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY) ////どうやって主キーを生成するか identity列を使います
	private long id;

	@Column(name="user_name")
	private String userName;

	@Column(name="password")
	private String password;

	@Column(name="full_name")
	private String fullName;

	@Column(name="is_admin")
	private int isAdmin;

//各フィールドのgetter/setterメソッドを記述
	public long getId(){
		return id;
	}

	public void setId(long id){
		this.id = id;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getFullName(){
		return fullName;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public int getIsAdmin(){
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin){
		this.isAdmin = isAdmin;
	}
}

package com.credit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {
	
	@Id
	@Column(name="id")
	Long id;
	
	@Column(name="name")
	String name;
	
	@Column(name="limit_bal")
	Integer limit_bal;
	
	@Column(name="sex")
	Integer sex;
	
	@Column(name="education")
	Integer education;
	
	@Column(name="marraige")
	Integer marraige;
	
	@Column(name="age")
	Integer age;
	
	@Column(name="pay_0")
	Integer pay_0;
	
	@Column(name="pay_2")
	Integer pay_2;
	
	@Column(name="pay_3")
	Integer pay_3;
	
	@Column(name="pay_4")
	Integer pay_4;
	
	@Column(name="pay_5")
	Integer pay_5;
	
	@Column(name="pay_6")
	Integer pay_6;
	
	@Column(name="bill_amt1")
	Integer bill_amt1;
	
	@Column(name="bill_amt2")
	Integer bill_amt2;
	
	@Column(name="bill_amt3")
	Integer bill_amt3;
	
	@Column(name="bill_amt4")
	Integer bill_amt4;
	
	@Column(name="bill_amt5")
	Integer bill_amt5;
	
	@Column(name="bill_amt6")
	Integer bill_amt6;
	
	@Column(name="default_payment_nxt_mnth")
	Boolean default_payment_nxt_mnth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	public Integer getMarraige() {
		return marraige;
	}

	public void setMarraige(Integer marraige) {
		this.marraige = marraige;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPay_0() {
		return pay_0;
	}

	public void setPay_0(Integer pay_0) {
		this.pay_0 = pay_0;
	}

	public Integer getPay_2() {
		return pay_2;
	}

	public void setPay_2(Integer pay_2) {
		this.pay_2 = pay_2;
	}

	public Integer getPay_3() {
		return pay_3;
	}

	public void setPay_3(Integer pay_3) {
		this.pay_3 = pay_3;
	}

	public Integer getPay_4() {
		return pay_4;
	}

	public void setPay_4(Integer pay_4) {
		this.pay_4 = pay_4;
	}

	public Integer getPay_5() {
		return pay_5;
	}

	public void setPay_5(Integer pay_5) {
		this.pay_5 = pay_5;
	}

	public Integer getPay_6() {
		return pay_6;
	}

	public void setPay_6(Integer pay_6) {
		this.pay_6 = pay_6;
	}

	public Integer getBill_amt1() {
		return bill_amt1;
	}

	public void setBill_amt1(Integer bill_amt1) {
		this.bill_amt1 = bill_amt1;
	}

	public Integer getBill_amt2() {
		return bill_amt2;
	}

	public void setBill_amt2(Integer bill_amt2) {
		this.bill_amt2 = bill_amt2;
	}

	public Integer getBill_amt3() {
		return bill_amt3;
	}

	public void setBill_amt3(Integer bill_amt3) {
		this.bill_amt3 = bill_amt3;
	}

	public Integer getBill_amt4() {
		return bill_amt4;
	}

	public void setBill_amt4(Integer bill_amt4) {
		this.bill_amt4 = bill_amt4;
	}

	public Integer getBill_amt5() {
		return bill_amt5;
	}

	public void setBill_amt5(Integer bill_amt5) {
		this.bill_amt5 = bill_amt5;
	}

	public Integer getBill_amt6() {
		return bill_amt6;
	}

	public void setBill_amt6(Integer bill_amt6) {
		this.bill_amt6 = bill_amt6;
	}

	public Boolean getDefault_payment_nxt_mnth() {
		return default_payment_nxt_mnth;
	}

	public void setDefault_payment_nxt_mnth(Boolean default_payment_nxt_mnth) {
		this.default_payment_nxt_mnth = default_payment_nxt_mnth;
	}

	public Integer getLimit_bal() {
		return limit_bal;
	}

	public void setLimit_bal(Integer limit_bal) {
		this.limit_bal = limit_bal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((bill_amt1 == null) ? 0 : bill_amt1.hashCode());
		result = prime * result + ((bill_amt2 == null) ? 0 : bill_amt2.hashCode());
		result = prime * result + ((bill_amt3 == null) ? 0 : bill_amt3.hashCode());
		result = prime * result + ((bill_amt4 == null) ? 0 : bill_amt4.hashCode());
		result = prime * result + ((bill_amt5 == null) ? 0 : bill_amt5.hashCode());
		result = prime * result + ((bill_amt6 == null) ? 0 : bill_amt6.hashCode());
		result = prime * result + ((default_payment_nxt_mnth == null) ? 0 : default_payment_nxt_mnth.hashCode());
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((limit_bal == null) ? 0 : limit_bal.hashCode());
		result = prime * result + ((marraige == null) ? 0 : marraige.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pay_0 == null) ? 0 : pay_0.hashCode());
		result = prime * result + ((pay_2 == null) ? 0 : pay_2.hashCode());
		result = prime * result + ((pay_3 == null) ? 0 : pay_3.hashCode());
		result = prime * result + ((pay_4 == null) ? 0 : pay_4.hashCode());
		result = prime * result + ((pay_5 == null) ? 0 : pay_5.hashCode());
		result = prime * result + ((pay_6 == null) ? 0 : pay_6.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (bill_amt1 == null) {
			if (other.bill_amt1 != null)
				return false;
		} else if (!bill_amt1.equals(other.bill_amt1))
			return false;
		if (bill_amt2 == null) {
			if (other.bill_amt2 != null)
				return false;
		} else if (!bill_amt2.equals(other.bill_amt2))
			return false;
		if (bill_amt3 == null) {
			if (other.bill_amt3 != null)
				return false;
		} else if (!bill_amt3.equals(other.bill_amt3))
			return false;
		if (bill_amt4 == null) {
			if (other.bill_amt4 != null)
				return false;
		} else if (!bill_amt4.equals(other.bill_amt4))
			return false;
		if (bill_amt5 == null) {
			if (other.bill_amt5 != null)
				return false;
		} else if (!bill_amt5.equals(other.bill_amt5))
			return false;
		if (bill_amt6 == null) {
			if (other.bill_amt6 != null)
				return false;
		} else if (!bill_amt6.equals(other.bill_amt6))
			return false;
		if (default_payment_nxt_mnth == null) {
			if (other.default_payment_nxt_mnth != null)
				return false;
		} else if (!default_payment_nxt_mnth.equals(other.default_payment_nxt_mnth))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (limit_bal == null) {
			if (other.limit_bal != null)
				return false;
		} else if (!limit_bal.equals(other.limit_bal))
			return false;
		if (marraige == null) {
			if (other.marraige != null)
				return false;
		} else if (!marraige.equals(other.marraige))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pay_0 == null) {
			if (other.pay_0 != null)
				return false;
		} else if (!pay_0.equals(other.pay_0))
			return false;
		if (pay_2 == null) {
			if (other.pay_2 != null)
				return false;
		} else if (!pay_2.equals(other.pay_2))
			return false;
		if (pay_3 == null) {
			if (other.pay_3 != null)
				return false;
		} else if (!pay_3.equals(other.pay_3))
			return false;
		if (pay_4 == null) {
			if (other.pay_4 != null)
				return false;
		} else if (!pay_4.equals(other.pay_4))
			return false;
		if (pay_5 == null) {
			if (other.pay_5 != null)
				return false;
		} else if (!pay_5.equals(other.pay_5))
			return false;
		if (pay_6 == null) {
			if (other.pay_6 != null)
				return false;
		} else if (!pay_6.equals(other.pay_6))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}

	
}

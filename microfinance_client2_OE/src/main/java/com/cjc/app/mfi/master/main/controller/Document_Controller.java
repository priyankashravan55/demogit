package com.cjc.app.mfi.master.main.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.Lob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.app.mfi.master.main.model.DocumentsDetails;
import com.cjc.app.mfi.master.main.model.GuarantorDetails;
import com.cjc.app.mfi.master.main.service_Interface.ServerceInterface;
import com.google.gson.Gson;

@RestController
@CrossOrigin("*")
public class Document_Controller {
	@Autowired
	ServerceInterface si;
	
	@PostMapping(value="/Cust_doc",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	
	public String saveCust_doc(/* @RequestParam("doc_id")int id, */
			/* FOR ANGULAR NEED TO THIS */
			@RequestPart(value= "doc",required = true)String doc,
			@RequestPart("adharCard")MultipartFile file1,
			@RequestPart("panCard")MultipartFile file2,
			@RequestPart("photo")MultipartFile file3,
			@RequestPart("signature")MultipartFile file4,
			@RequestPart("addressProof")MultipartFile file5,
			@RequestPart("bankStatemnet")MultipartFile file6,
			@RequestPart("bankCheck")MultipartFile file7
			)throws IOException
	{
		
		
		
		DocumentsDetails dd=new DocumentsDetails();
		//dd.setDoc_id(id);
		dd.setAdharCard(file1.getBytes());
		dd.setPanCard(file2.getBytes());
		dd.setPhoto(file3.getBytes());
		dd.setSignature(file4.getBytes());
		dd.setAddressProof(file5.getBytes());
		dd.setBankStatemnet(file6.getBytes());
		dd.setBankCheck(file7.getBytes());
		
		
		Gson gson=new Gson();
		DocumentsDetails d=gson.fromJson(doc, DocumentsDetails.class);
		
		dd.setCust_id(d.getCust_id());
		dd.setDoc_id(d.getDoc_id());
		//List<DocumentsDetails>list=si.saveDoc(dd);
		si.saveDoc(dd);
		
	return "Document added succefully";
	}
	
	//ENQUIRY DETAILS
	
	
	
}
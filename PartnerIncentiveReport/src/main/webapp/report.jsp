<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@taglib uri="/struts-tags" prefix="s" %> 
<%String path = request.getContextPath(); %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic CRUD Application - jQuery EasyUI CRUD Demo</title>
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/color.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/demo/demo.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.com/easyui/datagrid-scrollview.js"></script>
    
    <script type="text/javascript">
		function savereg(){
			$('#dg').datagrid('load',{
				'form.quarter': $('#f1').combobox('getValue'),
				'form.year': $('#f2').combobox('getValue'),
				'form.clawbackPeriod': $('#f3').combobox('getValue'),
				'form.iarrRebateTermMultiplier': $('#f4').combobox('getValue'),
				'form.iarrRebatePercentage': $('#f5').combobox('getValue'),
				'form.iarrPartnerRebateThreshold': $('#f6').combobox('getValue'),
				'form.lifeRebatePercentageThreshold': $('#f7').combobox('getValue'),
				'form.lifeRebateTermMultiplier': $('#f8').combobox('getValue'),
				'form.lifeRebatePercentage': $('#f9').combobox('getValue')
			});
		}
		
		$("#btn1").click(function () {
			alert($('f1').combobox('getValue'));
		})
		
	</script>
	
	
</head>
<body>
    <h2>Partner Incentive Report</h2>
    <p></p>
    
    <div class="easyui-panel" style="width:1100px;padding:10px;">
    	<!-- <form id="ff" action="<%=path %>/report/partner_incentive_form" method="get" enctype="multipart/form-data">  -->
    		<form id="ff" method="get">
    		<table>
            <tr>
                
            	<td>Period Fiscal Year:</td>
                <td><select id="f2" class="easyui-combobox" name="year"  style="width:200px;"
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=year'"></select></td>
            
            	<td>Quarter:</td>
                <td><select id="f1" class="easyui-combobox" name="quarter" style="width:200px;" 
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=quarter'"></select></td>
            	
            	<td>IARR Rebate Clawback Period (Days):</td>
                <td><select id="f3" class="easyui-combobox" name="clawbackPeriod" style="width:200px;" 
    	data-options="value:'90'"></select></td>
            
            </tr>
            
            <tr>
                <td>IARR Rebate Term Multiplier (Months):</td>
                <td><select id="f4" class="easyui-combobox" name="iarrRebateTermMultiplier" style="width:200px;" 
    	data-options="value:'12'"></select></td>
            	
            	<td>IARR Rebate Percentage (Value from 0 to 1):</td>
                <td><select id="f5" class="easyui-combobox" name="iarrRebatePercentage"  style="width:200px;"
    	data-options="value:'0.25'"></select></td>
            
            	<td>Lifecycle Rebate Percentage Threshold (Value from 0 to 1):</td>
                <td><select id="f7" class="easyui-combobox" name="lifeRebatePercentageThreshold" style="width:200px;" 
    	data-options="value:'0.9'"></select></td>
            
            </tr>
            
            <tr>            	
            	<td>Lifecycle Rebate Term Multiplier (Months):</td>
                <td><select id="f8" class="easyui-combobox" name="lifeRebateTermMultiplier"  style="width:200px;"
    	data-options="value:'6'"></select></td>
            
            	<td>Lifecycle Rebate Percentage (Value from 0 to 1):</td>
                <td><select id="f9" class="easyui-combobox" name="lifeRebatePercentage" style="width:200px;" 
    	data-options="value:'0.07'"></select></td>
            
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td> 
                <!--  <input type="submit" value="Submit"></input> -->
                
                <a href="###" class="easyui-linkbutton" iconCls="icon-ok" onclick="savereg()">Submit</a>
                
                </td>
            </tr>
            
    		</table>
    	</form>
	</div>
	
	<br/>
    
    <!-- <table id="dg" title="Partner Incentive Report" class="easyui-datagrid" style="width:5800px;height:250px"
            url="<%=path %>/data/partner_incentive!load" 
            fitColumns="true" singleSelect="true" method="get" view="scrollview" pageSize="50" rownumbers="true">
     -->
     <table id="dg" class="easyui-datagrid" style="width:5800px;height:250px"
			title="Partner Incentive Report"
			data-options="view:scrollview,rownumbers:true,singleSelect:true,
				url:'<%=path %>/data/partner_incentive!load',autoRowHeight:false,pageSize:50">
	     
        <thead>
            <tr>
				<th field="partnerName" >Partner Name</th>
				<th field="email">Lifecycle Partner Flag</th>
				<th field="pdbbegeoid">PDB¡¡BE GEO ID</th>
				<th field="country">Country</th>
				<th field="subId">Subscription ID</th>
				<th field="subFromDate">Subscription Effective From Date</th>
				<th field="subToDate">Subscription Effective To Date</th>
				<th field="preSubId">Previous Subscription ID</th>
				<th field="ccwId">CCW Web Order ID</th>
				<th field="orderEndDate">Order End Complete Date</th>
				<th field="orderType">Order Type</th>
				<th field="sellType">Sell Type</th>
				<th field="skuId">SKU ID</th>
				<th field="skuDescr">SKU Description</th>
				<th field="skuQuantity">SKU Quantity</th>
				<th field="unitPrice">Uint Price</th>
				<th field="skuQuantity">Extended Unit Price</th>
				<th field="skuMrr">SKU MRR</th>
				<th field="subMrr">SUBSCRIPTION MRR</th>
				<th field="currency">Currency</th>
				<th field="iarr">Incremental Growth (IARR) Rebate Value</th>
				<th field="partnerIarr">Partner Total IG(IARR) Rebate Value</th>
				<th field="lcInitial">Lifecycle Initial Subscription Value</th>
				<th field="lcEnd">Lifecycle End Subscription Value</th>
				<th field="partnerLcRebate">Partner Total Lifecycle Rebate Value</th>
				<th field="iarrAccrual">Incremental Growth(IARR) Accrual Value</th>
				<th field="partnerIarrAcc">Partner Total IG(IARR) Accrual Value</th>
				<th field="lcAccInitial">Lifecycle Accrual Initial Subscription Value</th>
				<th field="lcAccEnd">Lifecycle Accrual End Subscription Value</th>
				<th field="partnerTotalAcc">Partner Total Lifecycle Accrual Value</th>
				<th field="partnerTotalIG">Partner Total IG(IARR) True Up Value</th>
				<th field="partnerTotalTrueUp">Parnter Total Lifecycle True Up Value</th>
            </tr>
        </thead>
    </table>
    
    

    <style type="text/css">
        #fm{
            margin:0;
            padding:10px 30px;
        }
        .ftitle{
            font-size:14px;
            font-weight:bold;
            padding:5px 0;
            margin-bottom:10px;
            border-bottom:1px solid #ccc;
        }
        .fitem{
            margin-bottom:5px;
        }
        .fitem label{
            display:inline-block;
            width:80px;
        }
        .fitem input{
            width:160px;
        }
    </style>
</body>
</html>

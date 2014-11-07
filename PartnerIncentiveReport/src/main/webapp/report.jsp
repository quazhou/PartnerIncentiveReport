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
                <td>Quarter:</td>
                <td><select id="f1" class="easyui-combobox" name="quarter" style="width:200px;" 
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=quarter'"></select></td>
            	
            	<td>Period Fiscal Year:</td>
                <td><select id="f2" class="easyui-combobox" name="year"  style="width:200px;"
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=year'"></select></td>
            
            	<td>IARR Rebate Clawback Period (Days):</td>
                <td><select id="f3" class="easyui-combobox" name="clawbackPeriod" style="width:200px;" 
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=clawback_period'"></select></td>
            
            </tr>
            
            <tr>
                <td>IARR Rebate Term Multiplier (Months):</td>
                <td><select id="f4" class="easyui-combobox" name="iarrRebateTermMultiplier" style="width:200px;" 
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=iarr_rebate_term_multiplier'"></select></td>
            	
            	<td>IARR Rebate Percentage (Value from 0 to 1):</td>
                <td><select id="f5" class="easyui-combobox" name="iarrRebatePercentage"  style="width:200px;"
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=iarr_rebate_percentage'"></select></td>
            
            	<td>IARR Partner Rebate Threshold (Currency Unit):</td>
                <td><select id="f6" class="easyui-combobox" name="iarrPartnerRebateThreshold" style="width:200px;" 
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=iarr_partner_rebate_threshold'"></select></td>
            
            </tr>
            
            <tr>
                <td>Lifecycle Rebate Percentage Threshold (Value from 0 to 1):</td>
                <td><select id="f7" class="easyui-combobox" name="lifeRebatePercentageThreshold" style="width:200px;" 
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=life_rebate_percentage_threshold'"></select></td>
            	
            	<td>Lifecycle Rebate Term Multiplier (Months):</td>
                <td><select id="f8" class="easyui-combobox" name="lifeRebateTermMultiplier"  style="width:200px;"
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=life_rebate_term_multiplier'"></select></td>
            
            	<td>Lifecycle Rebate Percentage (Value from 0 to 1):</td>
                <td><select id="f9" class="easyui-combobox" name="lifeRebatePercentage" style="width:200px;" 
    	data-options="textField:'val',valueField:'val',url:'<%=path %>/data/partner_incentive_filter?filterName=life_rebate_percentage'"></select></td>
            
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="alert($('#f1').combobox('getValue'))">GetValue</a></td>
                <td> 
                <!--  <input type="submit" value="Submit"></input> -->
                
                <a href="###" class="easyui-linkbutton" iconCls="icon-ok" onclick="savereg()">Submit</a>
                
                </td>
            </tr>
            
    		</table>
    	</form>
	</div>
	
	<br/>
    
    <table id="dg" title="Partner Incentive Report" class="easyui-datagrid" style="width:6900px;height:250px"
            url="<%=path %>/data/partner_incentive!load" pagination="true"
            rownumbers="true" fitColumns="true" singleSelect="true" method="get">
        <thead>
            <tr>
                <th field="quarter" >Rebate Period Quarters</th>
                <th field="year" >Period Fiscal Year</th>
                <th field="clawbackPeriod" >IARR Rebate Clawback Period</th>
                <th field="iarrRebateTermMultiplier" >IARR Rebate Term Multiplier</th>
				<th field="iarrRebatePercentage" >IARR Rebate Percentage (Value from 0 to f1)</th>
				<th field="iarrPartnerRebateThreshold" >IARR Partner Rebate Threshold(Currency Unit)</th>
				<th field="lifeRebatePercentageThreshold" >Lifecycle Rebate Percentage Threshold(Value from 0 to 1)</th>
				<th field="lifeRebateTermMultiplier" >Lifecycle Rebate Term Multiplier(Months)</th>
				<th field="lifeRebatePercentage" >Lifecycle Rebate Percentage (Value from 0 to 1)</th>
				<th field="email" >Partner Name</th>
				<th field="email">Lifecycle Partner Flag</th>
				<th field="email">PDB¡¡BE GEO ID</th>
				<th field="email">Country</th>
				<th field="email">Subscription ID</th>
				<th field="email">Subscription Effective From Date</th>
				<th field="email">Subscription Effective To Date</th>
				<th field="email">Previous Subscription ID</th>
				<th field="email">CCW Web Order ID</th>
				<th field="email">Order End Complete Date</th>
				<th field="email">Order Type</th>
				<th field="email">Sell Type</th>
				<th field="email">SKU ID</th>
				<th field="email">SKU Description</th>
				<th field="email">Extended Unit Price</th>
				<th field="email">Currency</th>
				<th field="email">Incremental Growth (IARR) Rebate Value</th>
				<th field="email">Partner Total IG(IARR) Rebate Value</th>
				<th field="email">Lifecycle Initial Subscription Value</th>
				<th field="email">Lifecycle End Subscription Value</th>
				<th field="email">Partner Total Lifecycle Rebate Value</th>
				<th field="email">Incremental Growth(IARR) Accrual Value</th>
				<th field="email">Partner Total IG(IARR) Accrual Value</th>
				<th field="email">Lifecycle Accrual Initial Subscription Value</th>
				<th field="email">Lifecycle Accrual End Subscription Value</th>
				<th field="email">Partner Total Lifecycle Accrual Value</th>
				<th field="email">Partner Total IG(IARR) True Up Value</th>
				<th field="email">Parnter Total Lifecycle True Up Value</th>
            </tr>
        </thead>
    </table>
    
    
    <s:debug></s:debug> 
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

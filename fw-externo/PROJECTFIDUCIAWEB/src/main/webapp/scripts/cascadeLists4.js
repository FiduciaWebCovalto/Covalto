/**************************************************************************
	Autor:   jaah - Euritech Solutions
	Version: 1.0
	Fecha:   22-Jul-2002
	Descrip: Script para controlar dos o mas combo box en casada
**************************************************************************/

//Cuando se carga la pagina se cargan los datos al arreglo
var bOk = LoadArrays()

function sElement1(sParent1Id, sValue, sDescription)
{
	this.Parent1Id = sParent1Id
	this.Id = sValue
	this.Description = sDescription
}

function sElement2(sParent1Id, sParent2Id, sValue,sDescription)
{	
	this.Parent1Id = sParent1Id
	this.Parent2Id = sParent2Id
	this.Id = sValue
	this.Description = sDescription
}

function sElement3(sParent1Id, sParent2Id, sParent3Id, sValue,sDescription)
{	
	this.Parent1Id = sParent1Id
  this.Parent2Id = sParent2Id
  this.Parent3Id = sParent3Id
	this.Id = sValue
	this.Description = sDescription
}

function sElement4(sParent1Id, sParent2Id, sParent3Id, sParent4Id, sValue,sDescription)
{	
	this.Parent1Id = sParent1Id
  this.Parent2Id = sParent2Id
  this.Parent3Id = sParent3Id
  this.Parent4Id = sParent4Id
	this.Id = sValue
	this.Description = sDescription
}

function sElement5(sParent1Id, sParent2Id, sParent3Id, sParent4Id, sParent5Id, sValue,sDescription)
{	
	this.Parent1Id = sParent1Id
  this.Parent2Id = sParent2Id
  this.Parent3Id = sParent3Id
  this.Parent4Id = sParent4Id
  this.Parent5Id = sParent5Id
	this.Id = sValue
	this.Description = sDescription
}


function bCascadeDrop1(oDDsource1, oDDdest, aArray)
{
	var iX
	var sText1
  var sText2
	var iY= 0
	var sOptionId
	var sOptionDesc
	var iStartPos
	var iArrayMax = aArray.length
  if (oDDsource1.options.length>0)
   	sText1 = oDDsource1.options[oDDsource1.selectedIndex].value 
  else
    sText1 = '0'
	if (sText1 != '0')
	{
		oDDdest.options.length = 0                
		for (iX=0; iX<iArrayMax; iX++) 
		{		
			if(sText1==aArray[iX].Parent1Id)
			{
				sOptionId = aArray[iX].Id
				sOptionDesc= aArray[iX].Description
				//alert(sOptionDesc)
				oDDdest.options[iY] = new Option (sOptionDesc,sOptionId)	
				iY = iY +1		
			}
		}	
    if (oDDdest.options.length>0) oDDdest.options[0].selected=true
	}	
}

function bCascadeDrop2(oDDsource1, oDDsource2, oDDdest, aArray)
{
	var iX
	var sText1
  	var sText2
	var iY= 0
	var sOptionId
	var sOptionDesc
	var iStartPos
	var iArrayMax = aArray.length
	
  if (oDDsource1.options.length>0 && oDDsource2.options.length>0) {
   	sText1 = oDDsource1.options[oDDsource1.selectedIndex].value 
   	sText2 = oDDsource2.options[oDDsource2.selectedIndex].value


   } else {
    sText1 = '0'
   }
	if (sText1 != '0')
	{
		oDDdest.options.length = 0                
		for (iX=0; iX<iArrayMax; iX++) 
		{		
			if(sText1==aArray[iX].Parent1Id && sText2==aArray[iX].Parent2Id)
			{
				sOptionId = aArray[iX].Id
				sOptionDesc= aArray[iX].Description
				//alert(sOptionDesc)
				oDDdest.options[iY] = new Option (sOptionDesc,sOptionId)	
				iY = iY +1		
			}
		}	
    if (oDDdest.options.length>0) oDDdest.options[0].selected=true
	}	
}

function bCascadeDrop3(oDDsource1, oDDsource2, oDDsource3, oDDdest, aArray)
{
	var iX
	var sText1
  var sText2
	var iY= 0
	var sOptionId
	var sOptionDesc
	var iStartPos
	var iArrayMax = aArray.length
  if (oDDsource1.options.length>0) {
   	sText1 = oDDsource1.options[oDDsource1.selectedIndex].value 
    sText2 = oDDsource2.options[oDDsource2.selectedIndex].value
    sText3 = oDDsource3.options[oDDsource3.selectedIndex].value
   } else {
    sText1 = '0'
   }
	if (sText1 != '0')
	{
		oDDdest.options.length = 0                
		for (iX=0; iX<iArrayMax; iX++) 
		{		
			if(sText1==aArray[iX].Parent1Id && sText2==aArray[iX].Parent2Id &&
          sText3==aArray[iX].Parent3Id)
			{
				sOptionId = aArray[iX].Id
				sOptionDesc= aArray[iX].Description
				//alert(sOptionDesc)
				oDDdest.options[iY] = new Option (sOptionDesc,sOptionId)	
				iY = iY +1		
			}
		}	
    if (oDDdest.options.length>0) oDDdest.options[0].selected=true
	}	
}

function bCascadeDrop4(oDDsource1, oDDsource2, oDDsource3, oDDsource4, oDDdest, aArray)
{
	var iX
	var sText1
  var sText2
	var iY= 0
	var sOptionId
	var sOptionDesc
	var iStartPos
	var iArrayMax = aArray.length
  if (oDDsource1.options.length>0) {
   	sText1 = oDDsource1.options[oDDsource1.selectedIndex].value 
    sText2 = oDDsource2.options[oDDsource2.selectedIndex].value
    sText3 = oDDsource3.options[oDDsource3.selectedIndex].value
    sText4 = oDDsource4.options[oDDsource4.selectedIndex].value
   } else {
    sText1 = '0'
   }
	if (sText1 != '0')
	{
		oDDdest.options.length = 0                
		for (iX=0; iX<iArrayMax; iX++) 
		{		
			if(sText1==aArray[iX].Parent1Id && sText2==aArray[iX].Parent2Id &&
          sText3==aArray[iX].Parent3Id && sText4==aArray[iX].Parent4Id)
			{
				sOptionId = aArray[iX].Id
				sOptionDesc= aArray[iX].Description
				//alert(sOptionDesc)
				oDDdest.options[iY] = new Option (sOptionDesc,sOptionId)	
				iY = iY +1		
			}
		}	
    if (oDDdest.options.length>0) oDDdest.options[0].selected=true
	}	
}

function bCascadeDrop5(oDDsource1, oDDsource2, oDDsource3, oDDsource4, oDDsource5, oDDdest, aArray)
{
	var iX
	var sText1
	var sText2
	var iY= 0
	var sOptionId
	var sOptionDesc
	var iStartPos
	var iArrayMax = aArray.length
	sText1 = oDDsource1.options[oDDsource1.selectedIndex].value 
	sText2 = oDDsource2.options[oDDsource2.selectedIndex].value
	sText3 = oDDsource3.options[oDDsource3.selectedIndex].value
	sText4 = oDDsource4.options[oDDsource4.selectedIndex].value
	sText5 = oDDsource5.options[oDDsource5.selectedIndex].value
	
	if (sText1 != '0')
	{
		oDDdest.options.length = 0                
		for (iX=0; iX<iArrayMax; iX++) 
		{		
			if(sText1==aArray[iX].Parent1Id && sText2==aArray[iX].Parent2Id &&
				sText3==aArray[iX].Parent3Id && sText4==aArray[iX].Parent4Id &&
				sText5==aArray[iX].Parent5Id)
			{
				sOptionId = aArray[iX].Id
				sOptionDesc= aArray[iX].Description
				//alert(sOptionDesc)
				oDDdest.options[iY] = new Option (sOptionDesc,sOptionId)	
				iY = iY +1		
			}
		}	
    if (oDDdest.options.length>0) oDDdest.options[0].selected=true
	}	
}

class Empleado(object): #Creamos la clase Empleado que hereda de object

	def __init__(self):		#Atributos que contendran todas las clases hijas
		self.nombre = " "
		self.apellido = " "
		self.cedula = " "
		self.comisionf = 0
##SETER Y GETTER
	def agregar_nombre(self, n):
		self.nombre = n

	def agregar_apellido(self, a):
		self.apellido = a

	def agregar_edad(self, e):
		self.edad = e

	def agregar_cedula(self, c):
		self.cedula = c

	def agregar_comisionf(self , cf):
		self.comisionf = cf

	def obtener_nombre(self):
		return self.nombre

	def obtener_apellido(self):
		return self.apellido

	def obtener_edad(self):
		return self.edad

	def obtener_cedula(self):
		return self.cedula

	def obtener_comisionf(self):
		return self.comisionf
#Presentamos los datos en una cadena que recibirá los parametros necesarios para presentarse y será retornada
	def presentar_datos(self):
		c = "Información de %s-%s\n\tCedula%s"%(self.obtener_nombre(),self.obtener_apellido(),self.obtener_cedula())
		return c

class EmpleadoPorHoras(Empleado):#Creamos la clase EmpleadoPorHoras que heredará atributos de la clase Empleado

	def __init__(self):
		super(EmpleadoPorHoras, self).__init__() #Obtenemos el init de la clase empleado
		self.numero_horas = 0  #Agregamos los nuevos atributos de nuestra nueva clase
		self.valor_horas = 0
##Setter y getters
	def agregar_numero_horas(self, s):
		self.numero_horas= s

	def obtener_numero_horas(self):
		return self.numero_horas

	def agregar_valor_horas(self, d):
		self.valor_horas = d

	def obtener_valor_horas(self):
		return self.valor_horas
#Hacemos el método para calcular el sueldo de este empleado
	def calcular_sueldo(self):
		sueldo = self.numero_horas*self.valor_horas+self.comisionf
		return sueldo
#Creamos el método para presentar_datos con la ayuda de un super que permitirá presentar la cadena de nuestra clase padre
	def presentar_datos(self):
		c = "%s\nNumero de horas%s\nValor hora%s\nSueldo total:%s"%(super(EmpleadoPorHoras, self).presentar_datos(),\
			self.obtener_numero_horas(),self.obtener_valor_horas(),\
			self.calcular_sueldo())
		return c

#Creamos la clase empleado fijo
class EmpleadoFijo(Empleado):

	def __init__(self):
		super(EmpleadoFijo, self).__init__() #Traemos el init de la clase padre
		self.sueldof = 0  #Agregamos los atributos únicos de nuestra nueva clase
		self.descuentos = 0
##Creamos los setters y getters
	def agregar_sueldof(self, s):
		self.sueldof = s

	def obtener_sueldof(self):
		return self.sueldof

	def agregar_descuentos(self, d):
		self.descuentos = d

	def obtener_descuentof(self):
		return self.descuentos

	def calcular_sueldo_final(self):
		a=(self.sueldof*self.descuentos)/100
		sueldo = self.sueldof-a+self.comisionf
		return sueldo
#Creamos el método para presentar datos con el super para presentar la cadena padre y luego los nuevos atributos
	def presentar_datos(self):
		c="%sSueldo fijo:%s\nDescuento:%s\nTotal:%s"%(super(EmpleadoFijo, self).presentar_datos(),self.obtener_sueldof(),\
			self.obtener_descuentof(),self.calcular_sueldo_final())
		return c

#Creamos la clase empleado que hereda atributos de Empleado
class EmpleadoPorSemanas(Empleado):
	def __init__(self):
		super(EmpleadoPorSemanas, self).__init__()
		self.numero_semana = 0 #Creamos nuestros nuevos atributos
		self.valor_semana = 0
#Definimos setters y getters
	def agregar_numero_semana(self, n):
		self.numero_semana = n

	def obtener_numero_semana(self):
		return self.numero_semana

	def agregar_valor_semana(self, s):
		self.valor_semana = s

	def obtener_valor_semana(self):
		return self.valor_semana
#Hacemos un método para calcular el sueldo único de este tipo de trabajador
	def calcular_sueldo(self):
		sueldo = self.numero_semana*self.valor_semana
		return sueldo
#Creamos un método que presentara los atributos de clase padre con super y los nuevos atributos 
	def presentar_datos(self):
		c="%sNumero semanas:%s\nValor semana:%s\nSueldo total"%(super(EmpleadoPorSemanas, self).presentar_datos(),self.numero_semana,\
		self.valor_semana,self.calcular_sueldo())



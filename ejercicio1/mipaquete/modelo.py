class Empleado(object):

	def __init__(self):
		self.nombre = " "
		self.apellido = " "
		self.cedula = " "
		self.comisionf = 0

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

	def presentar_datos(self):
		c = "Información de %s-%s\n\tCedula%s"%(self.obtener_nombre(),self.obtener_apellido(),self.obtener_cedula())
		return c
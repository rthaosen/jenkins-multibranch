def buildApp() {
  echo 'Building Application ${NAME}'
}

def testApp() {
  echo 'Testing application'
}

def deployApp() {
  echo 'Deploying application ${params.VERSION}'
}

return this
